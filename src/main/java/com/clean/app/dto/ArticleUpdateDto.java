package com.clean.app.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.clean.app.domain.Article}
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
){
    public static ArticleUpdateDto of(String title, String content, String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}