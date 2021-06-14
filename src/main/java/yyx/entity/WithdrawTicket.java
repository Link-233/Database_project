package yyx.entity;

public class WithdrawTicket {
    private Integer id;

    private Integer bookId;

    private Boolean withdraw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Boolean getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Boolean withdraw) {
        this.withdraw = withdraw;
    }
}