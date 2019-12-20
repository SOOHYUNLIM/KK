package org.jarvis.kk.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Interest
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Interest {

    private String keyword;
}