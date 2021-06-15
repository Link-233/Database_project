package yyx.entity;

import java.util.Date;

public class AirInfo {
    private String id;

    private Integer bookId;

    private Date takeoffTime;

    private Date arriveTime;

    private String originStat;

    private String termStat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(Date takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getOriginStat() {
        return originStat;
    }

    public void setOriginStat(String originStat) {
        this.originStat = originStat == null ? null : originStat.trim();
    }

    public String getTermStat() {
        return termStat;
    }

    public void setTermStat(String termStat) {
        this.termStat = termStat == null ? null : termStat.trim();
    }
}