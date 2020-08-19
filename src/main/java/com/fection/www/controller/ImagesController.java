package com.fection.www.controller;

import com.fection.www.pojo.Images;
import com.fection.www.service.IImagesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ImagesController {
    @Resource
    private IImagesService imagesService;
    @GetMapping("/GetAllUser")
    public List<Images> getAllAdmin(){
        return imagesService.getAllImages();
    }
    @GetMapping("/getAllByUid/{iid}")
    public Images getAllByAid(@PathVariable("iid") Integer iid){
        return imagesService.getAllByIid(iid);
    }
    @GetMapping("/insertUser")
    public Integer insertAdmin(@RequestBody Images images){
        if(imagesService.insertImages(images)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/updateUser")
    public Integer updateAdmin(@RequestBody Images images){
        if(imagesService.updateImages(images)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/deleteUser/{iid}")
    public Integer deleteAdmin(@PathVariable("iid") Integer iid){
        if(imagesService.deleteImages(iid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
