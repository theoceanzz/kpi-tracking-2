package com.kpitracking.dto.response.bsc;

import lombok.*;

import java.util.UUID;

/** Khoa gắn với thẻ điểm (id + tên) — 1 thẻ điểm áp dụng cho nhiều khoa. */
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class ScorecardOrgUnitResponse {
    private UUID id;
    private String name;
}
