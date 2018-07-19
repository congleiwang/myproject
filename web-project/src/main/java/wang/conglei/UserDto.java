package wang.conglei;


import java.util.Date;

/**
 * @program: springTest
 * @description: 用户
 * @author: conglei.Wang
 * @create: 2018-06-23 14:25
 **/
public class UserDto {
    private String userName;
    private String id;
    private java.sql.Date birthday;
    private Date createGmt;
    private String loc;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.sql.Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateGmt() {
        return createGmt;
    }

    public void setCreateGmt(Date createGmt) {
        this.createGmt = createGmt;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", id='" + id + '\'' +
                ", birthday=" + birthday +
                ", createGmt=" + createGmt +
                '}';
    }
}
