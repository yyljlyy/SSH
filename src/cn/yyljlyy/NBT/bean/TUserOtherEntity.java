package cn.yyljlyy.NBT.bean;

import javax.persistence.*;

/**
 * Created by lee on 2015/6/16.
 */
@Entity
@Table(name = "t_user_other", schema = "", catalog = "ssh")
public class TUserOtherEntity {
    private int id;
    private String remarks;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserOtherEntity that = (TUserOtherEntity) o;

        if (id != that.id) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
