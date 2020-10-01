package com.Hesher.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoIsNull() {
            addCriterion("teacherShortInfo is null");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoIsNotNull() {
            addCriterion("teacherShortInfo is not null");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoEqualTo(String value) {
            addCriterion("teacherShortInfo =", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoNotEqualTo(String value) {
            addCriterion("teacherShortInfo <>", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoGreaterThan(String value) {
            addCriterion("teacherShortInfo >", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoGreaterThanOrEqualTo(String value) {
            addCriterion("teacherShortInfo >=", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoLessThan(String value) {
            addCriterion("teacherShortInfo <", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoLessThanOrEqualTo(String value) {
            addCriterion("teacherShortInfo <=", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoLike(String value) {
            addCriterion("teacherShortInfo like", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoNotLike(String value) {
            addCriterion("teacherShortInfo not like", value, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoIn(List<String> values) {
            addCriterion("teacherShortInfo in", values, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoNotIn(List<String> values) {
            addCriterion("teacherShortInfo not in", values, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoBetween(String value1, String value2) {
            addCriterion("teacherShortInfo between", value1, value2, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeachershortinfoNotBetween(String value1, String value2) {
            addCriterion("teacherShortInfo not between", value1, value2, "teachershortinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIsNull() {
            addCriterion("teacherInfo is null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIsNotNull() {
            addCriterion("teacherInfo is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoEqualTo(String value) {
            addCriterion("teacherInfo =", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotEqualTo(String value) {
            addCriterion("teacherInfo <>", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoGreaterThan(String value) {
            addCriterion("teacherInfo >", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoGreaterThanOrEqualTo(String value) {
            addCriterion("teacherInfo >=", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLessThan(String value) {
            addCriterion("teacherInfo <", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLessThanOrEqualTo(String value) {
            addCriterion("teacherInfo <=", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoLike(String value) {
            addCriterion("teacherInfo like", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotLike(String value) {
            addCriterion("teacherInfo not like", value, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoIn(List<String> values) {
            addCriterion("teacherInfo in", values, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotIn(List<String> values) {
            addCriterion("teacherInfo not in", values, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoBetween(String value1, String value2) {
            addCriterion("teacherInfo between", value1, value2, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfoNotBetween(String value1, String value2) {
            addCriterion("teacherInfo not between", value1, value2, "teacherinfo");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2IsNull() {
            addCriterion("teacherInfo2 is null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2IsNotNull() {
            addCriterion("teacherInfo2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2EqualTo(String value) {
            addCriterion("teacherInfo2 =", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2NotEqualTo(String value) {
            addCriterion("teacherInfo2 <>", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2GreaterThan(String value) {
            addCriterion("teacherInfo2 >", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2GreaterThanOrEqualTo(String value) {
            addCriterion("teacherInfo2 >=", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2LessThan(String value) {
            addCriterion("teacherInfo2 <", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2LessThanOrEqualTo(String value) {
            addCriterion("teacherInfo2 <=", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2Like(String value) {
            addCriterion("teacherInfo2 like", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2NotLike(String value) {
            addCriterion("teacherInfo2 not like", value, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2In(List<String> values) {
            addCriterion("teacherInfo2 in", values, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2NotIn(List<String> values) {
            addCriterion("teacherInfo2 not in", values, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2Between(String value1, String value2) {
            addCriterion("teacherInfo2 between", value1, value2, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo2NotBetween(String value1, String value2) {
            addCriterion("teacherInfo2 not between", value1, value2, "teacherinfo2");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3IsNull() {
            addCriterion("teacherInfo3 is null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3IsNotNull() {
            addCriterion("teacherInfo3 is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3EqualTo(String value) {
            addCriterion("teacherInfo3 =", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3NotEqualTo(String value) {
            addCriterion("teacherInfo3 <>", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3GreaterThan(String value) {
            addCriterion("teacherInfo3 >", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3GreaterThanOrEqualTo(String value) {
            addCriterion("teacherInfo3 >=", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3LessThan(String value) {
            addCriterion("teacherInfo3 <", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3LessThanOrEqualTo(String value) {
            addCriterion("teacherInfo3 <=", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3Like(String value) {
            addCriterion("teacherInfo3 like", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3NotLike(String value) {
            addCriterion("teacherInfo3 not like", value, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3In(List<String> values) {
            addCriterion("teacherInfo3 in", values, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3NotIn(List<String> values) {
            addCriterion("teacherInfo3 not in", values, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3Between(String value1, String value2) {
            addCriterion("teacherInfo3 between", value1, value2, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andTeacherinfo3NotBetween(String value1, String value2) {
            addCriterion("teacherInfo3 not between", value1, value2, "teacherinfo3");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1IsNull() {
            addCriterion("teacher_page_pic_1 is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1IsNotNull() {
            addCriterion("teacher_page_pic_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1EqualTo(String value) {
            addCriterion("teacher_page_pic_1 =", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1NotEqualTo(String value) {
            addCriterion("teacher_page_pic_1 <>", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1GreaterThan(String value) {
            addCriterion("teacher_page_pic_1 >", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1GreaterThanOrEqualTo(String value) {
            addCriterion("teacher_page_pic_1 >=", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1LessThan(String value) {
            addCriterion("teacher_page_pic_1 <", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1LessThanOrEqualTo(String value) {
            addCriterion("teacher_page_pic_1 <=", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1Like(String value) {
            addCriterion("teacher_page_pic_1 like", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1NotLike(String value) {
            addCriterion("teacher_page_pic_1 not like", value, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1In(List<String> values) {
            addCriterion("teacher_page_pic_1 in", values, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1NotIn(List<String> values) {
            addCriterion("teacher_page_pic_1 not in", values, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1Between(String value1, String value2) {
            addCriterion("teacher_page_pic_1 between", value1, value2, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic1NotBetween(String value1, String value2) {
            addCriterion("teacher_page_pic_1 not between", value1, value2, "teacherPagePic1");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2IsNull() {
            addCriterion("teacher_page_pic_2 is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2IsNotNull() {
            addCriterion("teacher_page_pic_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2EqualTo(String value) {
            addCriterion("teacher_page_pic_2 =", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2NotEqualTo(String value) {
            addCriterion("teacher_page_pic_2 <>", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2GreaterThan(String value) {
            addCriterion("teacher_page_pic_2 >", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2GreaterThanOrEqualTo(String value) {
            addCriterion("teacher_page_pic_2 >=", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2LessThan(String value) {
            addCriterion("teacher_page_pic_2 <", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2LessThanOrEqualTo(String value) {
            addCriterion("teacher_page_pic_2 <=", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2Like(String value) {
            addCriterion("teacher_page_pic_2 like", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2NotLike(String value) {
            addCriterion("teacher_page_pic_2 not like", value, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2In(List<String> values) {
            addCriterion("teacher_page_pic_2 in", values, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2NotIn(List<String> values) {
            addCriterion("teacher_page_pic_2 not in", values, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2Between(String value1, String value2) {
            addCriterion("teacher_page_pic_2 between", value1, value2, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andTeacherPagePic2NotBetween(String value1, String value2) {
            addCriterion("teacher_page_pic_2 not between", value1, value2, "teacherPagePic2");
            return (Criteria) this;
        }

        public Criteria andPic1IsNull() {
            addCriterion("pic1 is null");
            return (Criteria) this;
        }

        public Criteria andPic1IsNotNull() {
            addCriterion("pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andPic1EqualTo(String value) {
            addCriterion("pic1 =", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotEqualTo(String value) {
            addCriterion("pic1 <>", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThan(String value) {
            addCriterion("pic1 >", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThanOrEqualTo(String value) {
            addCriterion("pic1 >=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThan(String value) {
            addCriterion("pic1 <", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThanOrEqualTo(String value) {
            addCriterion("pic1 <=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Like(String value) {
            addCriterion("pic1 like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotLike(String value) {
            addCriterion("pic1 not like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1In(List<String> values) {
            addCriterion("pic1 in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotIn(List<String> values) {
            addCriterion("pic1 not in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Between(String value1, String value2) {
            addCriterion("pic1 between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotBetween(String value1, String value2) {
            addCriterion("pic1 not between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic2IsNull() {
            addCriterion("pic2 is null");
            return (Criteria) this;
        }

        public Criteria andPic2IsNotNull() {
            addCriterion("pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andPic2EqualTo(String value) {
            addCriterion("pic2 =", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotEqualTo(String value) {
            addCriterion("pic2 <>", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThan(String value) {
            addCriterion("pic2 >", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThanOrEqualTo(String value) {
            addCriterion("pic2 >=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThan(String value) {
            addCriterion("pic2 <", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThanOrEqualTo(String value) {
            addCriterion("pic2 <=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Like(String value) {
            addCriterion("pic2 like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotLike(String value) {
            addCriterion("pic2 not like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2In(List<String> values) {
            addCriterion("pic2 in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotIn(List<String> values) {
            addCriterion("pic2 not in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Between(String value1, String value2) {
            addCriterion("pic2 between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotBetween(String value1, String value2) {
            addCriterion("pic2 not between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic3IsNull() {
            addCriterion("pic3 is null");
            return (Criteria) this;
        }

        public Criteria andPic3IsNotNull() {
            addCriterion("pic3 is not null");
            return (Criteria) this;
        }

        public Criteria andPic3EqualTo(String value) {
            addCriterion("pic3 =", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotEqualTo(String value) {
            addCriterion("pic3 <>", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThan(String value) {
            addCriterion("pic3 >", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThanOrEqualTo(String value) {
            addCriterion("pic3 >=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThan(String value) {
            addCriterion("pic3 <", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThanOrEqualTo(String value) {
            addCriterion("pic3 <=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Like(String value) {
            addCriterion("pic3 like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotLike(String value) {
            addCriterion("pic3 not like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3In(List<String> values) {
            addCriterion("pic3 in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotIn(List<String> values) {
            addCriterion("pic3 not in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Between(String value1, String value2) {
            addCriterion("pic3 between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotBetween(String value1, String value2) {
            addCriterion("pic3 not between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic4IsNull() {
            addCriterion("pic4 is null");
            return (Criteria) this;
        }

        public Criteria andPic4IsNotNull() {
            addCriterion("pic4 is not null");
            return (Criteria) this;
        }

        public Criteria andPic4EqualTo(String value) {
            addCriterion("pic4 =", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotEqualTo(String value) {
            addCriterion("pic4 <>", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThan(String value) {
            addCriterion("pic4 >", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThanOrEqualTo(String value) {
            addCriterion("pic4 >=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThan(String value) {
            addCriterion("pic4 <", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThanOrEqualTo(String value) {
            addCriterion("pic4 <=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Like(String value) {
            addCriterion("pic4 like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotLike(String value) {
            addCriterion("pic4 not like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4In(List<String> values) {
            addCriterion("pic4 in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotIn(List<String> values) {
            addCriterion("pic4 not in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Between(String value1, String value2) {
            addCriterion("pic4 between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotBetween(String value1, String value2) {
            addCriterion("pic4 not between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic5IsNull() {
            addCriterion("pic5 is null");
            return (Criteria) this;
        }

        public Criteria andPic5IsNotNull() {
            addCriterion("pic5 is not null");
            return (Criteria) this;
        }

        public Criteria andPic5EqualTo(String value) {
            addCriterion("pic5 =", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotEqualTo(String value) {
            addCriterion("pic5 <>", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThan(String value) {
            addCriterion("pic5 >", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThanOrEqualTo(String value) {
            addCriterion("pic5 >=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThan(String value) {
            addCriterion("pic5 <", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThanOrEqualTo(String value) {
            addCriterion("pic5 <=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Like(String value) {
            addCriterion("pic5 like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotLike(String value) {
            addCriterion("pic5 not like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5In(List<String> values) {
            addCriterion("pic5 in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotIn(List<String> values) {
            addCriterion("pic5 not in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Between(String value1, String value2) {
            addCriterion("pic5 between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotBetween(String value1, String value2) {
            addCriterion("pic5 not between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andIndexRangeIsNull() {
            addCriterion("index_range is null");
            return (Criteria) this;
        }

        public Criteria andIndexRangeIsNotNull() {
            addCriterion("index_range is not null");
            return (Criteria) this;
        }

        public Criteria andIndexRangeEqualTo(Integer value) {
            addCriterion("index_range =", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeNotEqualTo(Integer value) {
            addCriterion("index_range <>", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeGreaterThan(Integer value) {
            addCriterion("index_range >", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_range >=", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeLessThan(Integer value) {
            addCriterion("index_range <", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeLessThanOrEqualTo(Integer value) {
            addCriterion("index_range <=", value, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeIn(List<Integer> values) {
            addCriterion("index_range in", values, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeNotIn(List<Integer> values) {
            addCriterion("index_range not in", values, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeBetween(Integer value1, Integer value2) {
            addCriterion("index_range between", value1, value2, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("index_range not between", value1, value2, "indexRange");
            return (Criteria) this;
        }

        public Criteria andIndexShowIsNull() {
            addCriterion("index_show is null");
            return (Criteria) this;
        }

        public Criteria andIndexShowIsNotNull() {
            addCriterion("index_show is not null");
            return (Criteria) this;
        }

        public Criteria andIndexShowEqualTo(Integer value) {
            addCriterion("index_show =", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotEqualTo(Integer value) {
            addCriterion("index_show <>", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowGreaterThan(Integer value) {
            addCriterion("index_show >", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_show >=", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowLessThan(Integer value) {
            addCriterion("index_show <", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowLessThanOrEqualTo(Integer value) {
            addCriterion("index_show <=", value, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowIn(List<Integer> values) {
            addCriterion("index_show in", values, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotIn(List<Integer> values) {
            addCriterion("index_show not in", values, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowBetween(Integer value1, Integer value2) {
            addCriterion("index_show between", value1, value2, "indexShow");
            return (Criteria) this;
        }

        public Criteria andIndexShowNotBetween(Integer value1, Integer value2) {
            addCriterion("index_show not between", value1, value2, "indexShow");
            return (Criteria) this;
        }

        public Criteria andInstrumentIsNull() {
            addCriterion("instrument is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentIsNotNull() {
            addCriterion("instrument is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentEqualTo(String value) {
            addCriterion("instrument =", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotEqualTo(String value) {
            addCriterion("instrument <>", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThan(String value) {
            addCriterion("instrument >", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThanOrEqualTo(String value) {
            addCriterion("instrument >=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThan(String value) {
            addCriterion("instrument <", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThanOrEqualTo(String value) {
            addCriterion("instrument <=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLike(String value) {
            addCriterion("instrument like", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotLike(String value) {
            addCriterion("instrument not like", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentIn(List<String> values) {
            addCriterion("instrument in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotIn(List<String> values) {
            addCriterion("instrument not in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentBetween(String value1, String value2) {
            addCriterion("instrument between", value1, value2, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotBetween(String value1, String value2) {
            addCriterion("instrument not between", value1, value2, "instrument");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}