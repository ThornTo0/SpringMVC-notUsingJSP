package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MaapingclassController {

    /*
    회원 목록 조회 : GET
    회원 등록 : Post
    회원 조회 : Get
    회원 수정 : Patch
    회원 삭제 : Delete
     */

    @GetMapping
    public String user(){
        return "get users";
    }
     @PostMapping
    public String addUser(){
        return "Post users";
    }
     @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId=" + userId;
    }
     @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userID){
        return "update userId" + userID;
    }

}
