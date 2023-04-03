package spring.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName; // 고객이 업로드한 파일명
    private String storeFileName; // 실제 서버 저장 파일명 (중복방지)


    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

}
