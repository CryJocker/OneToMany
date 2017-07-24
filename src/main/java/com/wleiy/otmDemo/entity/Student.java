package com.wleiy.otmDemo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wl_wl on 2017/7/24 0024.
 */
@Entity
public class Student implements Serializable {
    private int sid;
    private String sname;
    private String sex;
    private Integer sgid;

    @JSONField(serialize=false)
    private Grade gradeByGid;

    @Id
    @Column(name = "sid")
    @GeneratedValue(generator = "mm")
    @GenericGenerator(name = "mm",strategy = "native")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "s_gid")
    public Integer getSgid() {
        return sgid;
    }

    public void setSgid(Integer sgid) {
        this.sgid = sgid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sid != student.sid) return false;
        if (sname != null ? !sname.equals(student.sname) : student.sname != null) return false;
        if (sex != null ? !sex.equals(student.sex) : student.sex != null) return false;
        if (sgid != null ? !sgid.equals(student.sgid) : student.sgid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (sgid != null ? sgid.hashCode() : 0);
        return result;
    }

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "s_gid", referencedColumnName = "gid",insertable = false,updatable = false)
    public Grade getGradeByGid() {
        return gradeByGid;
    }

    public void setGradeByGid(Grade gradeByGid) {
        this.gradeByGid = gradeByGid;
    }
}
