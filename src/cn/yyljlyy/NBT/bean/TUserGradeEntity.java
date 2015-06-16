package cn.yyljlyy.NBT.bean;

import javax.persistence.*;

/**
 * Created by lee on 2015/6/16.
 */
@Entity
@Table(name = "t_user_grade", schema = "", catalog = "ssh")
public class TUserGradeEntity {
    private int id;
    private Integer math;
    private Integer english;
    private Integer chinese;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "math")
    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    @Basic
    @Column(name = "english")
    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    @Basic
    @Column(name = "chinese")
    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserGradeEntity that = (TUserGradeEntity) o;

        if (id != that.id) return false;
        if (math != null ? !math.equals(that.math) : that.math != null) return false;
        if (english != null ? !english.equals(that.english) : that.english != null) return false;
        if (chinese != null ? !chinese.equals(that.chinese) : that.chinese != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (math != null ? math.hashCode() : 0);
        result = 31 * result + (english != null ? english.hashCode() : 0);
        result = 31 * result + (chinese != null ? chinese.hashCode() : 0);
        return result;
    }
}
