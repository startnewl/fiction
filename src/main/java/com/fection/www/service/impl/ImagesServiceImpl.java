package com.fection.www.service.impl;

import com.fection.www.mapper.ImagesMapper;
import com.fection.www.pojo.Images;
import com.fection.www.service.IImagesService;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ImagesServiceImpl implements IImagesService {
    @Resource
    private ImagesMapper imagesMapper;
    @Override
    public List<Images> getAllImages() {
        return imagesMapper.getAllImages();
    }

    @Override
    public Images getAllByIid(Integer iid) {
        return imagesMapper.getAllByIid(iid);
    }

    @Override
    public int insertImages(Images images) {
        return imagesMapper.insertImages(images);
    }

    @Override
    public int updateImages(Images images) {
        return imagesMapper.updateImages(images);
    }

    @Override
    public int deleteImages(Integer iid) {
        return imagesMapper.deleteImages(iid);
    }
}
