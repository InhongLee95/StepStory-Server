package com.kcs.stepstory.dto.request;

import com.kcs.stepstory.domain.DetailCourse;
import lombok.Builder;

import java.sql.Timestamp;

@Builder
public record AddDetailCourseDto(
        Timestamp travelDate,
        String gps,
        int sequence,
        String locationName,
        Long travelReportId
) {
    public static AddDetailCourseDto fromEntity(DetailCourse detailCourse){
        return AddDetailCourseDto.builder()
                .travelDate(detailCourse.getTravelDate())
                .gps(detailCourse.getGps())
                .sequence(detailCourse.getSequence())
                .locationName(detailCourse.getLocationName())
                .travelReportId(detailCourse.getTravelReport().getTravelReportId())
                .build();
    }
}
