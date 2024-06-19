package com.techevents.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO (
        String title,
        String description,
        Long date,
        String city,
        Boolean remote,
        String eventUrl,
        MultipartFile image
) {

}
