package com.develop.web.video.dto;

import com.develop.web.video.service.FileExtensionExtractor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class FileDto {
    private final FileExtensionExtractor fileExtensionExtractor = new FileExtensionExtractor();

    public FileDto(String originalFileName) {
        this.uuid = UUID.randomUUID().toString();
        this.originalFileName = originalFileName;
        this.ext = fileExtensionExtractor.extractExt(originalFileName);
    }

    public String uuid;
    public String originalFileName;
    public String ext;
}
