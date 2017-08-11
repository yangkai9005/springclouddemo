package com.touna.study.studyspringcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	@Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/haha",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.hi(name);
    }
}