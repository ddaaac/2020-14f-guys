package com.woowacourse.pelotonbackend.certification.domain;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CertificationRepositoryCustom {

    Page<Certification> findByRiderId(Long id, Pageable pageable);

    Page<Certification> findByMissionIds(List<Long> missionIds, Pageable pageable);
}