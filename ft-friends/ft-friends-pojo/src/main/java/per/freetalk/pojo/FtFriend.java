package per.freetalk.pojo;

public class FtFriend {
    private Long id;

    private String myid;

    private String myfriendid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMyid() {
        return myid;
    }

    public void setMyid(String myid) {
        this.myid = myid == null ? null : myid.trim();
    }

    public String getMyfriendid() {
        return myfriendid;
    }

    public void setMyfriendid(String myfriendid) {
        this.myfriendid = myfriendid == null ? null : myfriendid.trim();
    }
}