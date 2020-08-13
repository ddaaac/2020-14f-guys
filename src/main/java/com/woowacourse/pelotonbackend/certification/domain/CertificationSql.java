package com.woowacourse.pelotonbackend.certification.domain;

public class CertificationSql {
    public static String findByRiderId() {
        return new StringBuilder()
            .append("SELECT CERTIFICATION.ID AS ID")
            .append(", CERTIFICATION.STATUS AS STATUS")
            .append(", CERTIFICATION.DESCRIPTION AS DESCRIPTION")
            .append(", CERTIFICATION.RIDER_ID AS RIDER_ID, CERTIFICATION.MISSION_ID AS MISSION_ID")
            .append(" FROM CERTIFICATION")
            .append(" WHERE RIDER_ID = :riderId")
            .append(" LIMIT :pageSize OFFSET :offset")
            .toString();
    }

    public static String countByRiderId() {
        return new StringBuilder()
            .append("SELECT COUNT(*)")
            .append(" FROM CERTIFICATION")
            .append(" WHERE RIDER_ID = :riderId")
            .toString();
    }

    public static String findByMissionIds() {
        return new StringBuilder()
            .append("SELECT CERTIFICATION.ID AS ID")
            .append(", CERTIFICATION.STATUS AS STATUS")
            .append(", CERTIFICATION.DESCRIPTION AS DESCRIPTION")
            .append(", CERTIFICATION.RIDER_ID AS RIDER_ID, CERTIFICATION.MISSION_ID AS MISSION_ID")
            .append(" FROM CERTIFICATION")
            .append(" WHERE MISSION_ID IN (:missionIds)")
            .append(" LIMIT :pageSize OFFSET :offset")
            .toString();
    }

    public static String countByMissionIds() {
        return new StringBuilder()
            .append("SELECT COUNT(*)")
            .append(" FROM CERTIFICATION")
            .append(" WHERE MISSION_ID IN (:missionIds)")
            .toString();
    }
}
