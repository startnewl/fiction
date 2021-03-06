package com.fection.www.mapper;

import com.fection.www.pojo.Images;

import java.util.List;

public interface ImagesMapper {
    List<Images> getAllImages();
    Images getAllByIid(Integer iid);
    int insertImages(Images images);
    int updateImages(Images images);
    int deleteImages(Integer iid);
}