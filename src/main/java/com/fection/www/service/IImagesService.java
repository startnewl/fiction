package com.fection.www.service;

import com.fection.www.pojo.Images;

import java.util.List;

public interface IImagesService {
    List<Images> getAllImages();
    Images getAllByIid(Integer iid);
    int insertImages(Images images);
    int updateImages(Images images);
    int deleteImages(Integer iid);
}
