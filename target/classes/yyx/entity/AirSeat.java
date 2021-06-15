package yyx.entity;

public class AirSeat {
    private Integer id;

    private String flightId;

    private Integer fullratio;

    private Integer seatnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId == null ? null : flightId.trim();
    }

    public Integer getFullratio() {
        return fullratio;
    }

    public void setFullratio(Integer fullratio) {
        this.fullratio = fullratio;
    }

    public Integer getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(Integer seatnum) {
        this.seatnum = seatnum;
    }
}