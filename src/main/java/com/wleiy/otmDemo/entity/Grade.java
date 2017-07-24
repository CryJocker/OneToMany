package com.wleiy.otmDemo.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by wl_wl on 2017/7/24 0024.
 */
@Entity
public class Grade implements Serializable {
    private int gid;
    private String gname;
    private String gdesc;


    private Set<Student> students;

    @Id
    @Column(name = "gid")
    @GeneratedValue(generator = "mm")
    @GenericGenerator(name = "mm",strategy = "native")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Basic
    @Column(name = "gdesc")
    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;

        if (gid != grade.gid) return false;
        if (gname != null ? !gname.equals(grade.gname) : grade.gname != null) return false;
        if (gdesc != null ? !gdesc.equals(grade.gdesc) : grade.gdesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gdesc != null ? gdesc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "gradeByGid",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> studentsByGid) {
        this.students = studentsByGid;
    }
}
