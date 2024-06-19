package com.techevents.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;

public record EventResponseDTO(
        UUID id,
        String title,
        String description,
        Date date,
        String city,
        Boolean remote,
        String eventUrl,
        String imageUrl
) {}
