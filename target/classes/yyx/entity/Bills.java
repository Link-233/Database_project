package yyx.entity;

public class Bills {
    private Integer id;

    private Integer pId;

    private Integer unpaid;

    private Integer total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(Integer unpaid) {
        this.unpaid = unpaid;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}