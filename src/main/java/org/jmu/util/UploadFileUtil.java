package org.jmu.util;

import org.jmu.entity.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UploadFileUtil {
    ResponseEntity responseEntity = new ResponseEntity();
    TimeFormat timeFormat = new TimeFormat();

    public ResponseEntity uploadFile(MultipartFile file) throws IOException {

        if (file.isEmpty()) {
            responseEntity.setCode(300);
            responseEntity.setMsg("文件为空");
            return responseEntity;
        }
        String originalFileName = file.getOriginalFilename();
        String fileName = timeFormat.dateFormat(System.currentTimeMillis()) + "." + originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String filePath = "/road/";
        File uploadFile = new File(filePath + fileName);
        if (!uploadFile.getParentFile().exists()) {
            uploadFile.getParentFile().mkdirs();
        }
        FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(uploadFile));
        responseEntity.setCode(200);
        responseEntity.setMsg("上传成功");
        responseEntity.setData("/images/" + fileName);
        return responseEntity;
    }

    public ResponseEntity uploadFile(MultipartFile file, int fName) throws IOException {

        if (file.isEmpty()) {
            responseEntity.setCode(300);
            responseEntity.setMsg("文件为空");
            return responseEntity;
        }
        String originalFileName = file.getOriginalFilename();
        String fileName = timeFormat.dateFormat(System.currentTimeMillis()) + "-" + fName + "." + originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String filePath = "/road/";
        File uploadFile = new File(filePath + fileName);
        if (!uploadFile.getParentFile().exists()) {
            uploadFile.getParentFile().mkdirs();
        }
        FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(uploadFile));
        responseEntity.setCode(200);
        responseEntity.setMsg("上传成功");
        responseEntity.setData("/images/" + fileName);
        return responseEntity;
    }
}
