package com.Hesher.pojo;

import java.util.ArrayList;
import java.util.List;

public class VideoShowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoShowExample() {
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

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1IsNull() {
            addCriterion("video_tittle_1 is null");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1IsNotNull() {
            addCriterion("video_tittle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1EqualTo(String value) {
            addCriterion("video_tittle_1 =", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1NotEqualTo(String value) {
            addCriterion("video_tittle_1 <>", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1GreaterThan(String value) {
            addCriterion("video_tittle_1 >", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1GreaterThanOrEqualTo(String value) {
            addCriterion("video_tittle_1 >=", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1LessThan(String value) {
            addCriterion("video_tittle_1 <", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1LessThanOrEqualTo(String value) {
            addCriterion("video_tittle_1 <=", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1Like(String value) {
            addCriterion("video_tittle_1 like", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1NotLike(String value) {
            addCriterion("video_tittle_1 not like", value, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1In(List<String> values) {
            addCriterion("video_tittle_1 in", values, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1NotIn(List<String> values) {
            addCriterion("video_tittle_1 not in", values, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1Between(String value1, String value2) {
            addCriterion("video_tittle_1 between", value1, value2, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle1NotBetween(String value1, String value2) {
            addCriterion("video_tittle_1 not between", value1, value2, "videoTittle1");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2IsNull() {
            addCriterion("video_tittle_2 is null");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2IsNotNull() {
            addCriterion("video_tittle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2EqualTo(String value) {
            addCriterion("video_tittle_2 =", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2NotEqualTo(String value) {
            addCriterion("video_tittle_2 <>", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2GreaterThan(String value) {
            addCriterion("video_tittle_2 >", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2GreaterThanOrEqualTo(String value) {
            addCriterion("video_tittle_2 >=", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2LessThan(String value) {
            addCriterion("video_tittle_2 <", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2LessThanOrEqualTo(String value) {
            addCriterion("video_tittle_2 <=", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2Like(String value) {
            addCriterion("video_tittle_2 like", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2NotLike(String value) {
            addCriterion("video_tittle_2 not like", value, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2In(List<String> values) {
            addCriterion("video_tittle_2 in", values, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2NotIn(List<String> values) {
            addCriterion("video_tittle_2 not in", values, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2Between(String value1, String value2) {
            addCriterion("video_tittle_2 between", value1, value2, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoTittle2NotBetween(String value1, String value2) {
            addCriterion("video_tittle_2 not between", value1, value2, "videoTittle2");
            return (Criteria) this;
        }

        public Criteria andVideoXIsNull() {
            addCriterion("video_x is null");
            return (Criteria) this;
        }

        public Criteria andVideoXIsNotNull() {
            addCriterion("video_x is not null");
            return (Criteria) this;
        }

        public Criteria andVideoXEqualTo(Integer value) {
            addCriterion("video_x =", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXNotEqualTo(Integer value) {
            addCriterion("video_x <>", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXGreaterThan(Integer value) {
            addCriterion("video_x >", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_x >=", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXLessThan(Integer value) {
            addCriterion("video_x <", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXLessThanOrEqualTo(Integer value) {
            addCriterion("video_x <=", value, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXIn(List<Integer> values) {
            addCriterion("video_x in", values, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXNotIn(List<Integer> values) {
            addCriterion("video_x not in", values, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXBetween(Integer value1, Integer value2) {
            addCriterion("video_x between", value1, value2, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoXNotBetween(Integer value1, Integer value2) {
            addCriterion("video_x not between", value1, value2, "videoX");
            return (Criteria) this;
        }

        public Criteria andVideoYIsNull() {
            addCriterion("video_y is null");
            return (Criteria) this;
        }

        public Criteria andVideoYIsNotNull() {
            addCriterion("video_y is not null");
            return (Criteria) this;
        }

        public Criteria andVideoYEqualTo(Integer value) {
            addCriterion("video_y =", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYNotEqualTo(Integer value) {
            addCriterion("video_y <>", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYGreaterThan(Integer value) {
            addCriterion("video_y >", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_y >=", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYLessThan(Integer value) {
            addCriterion("video_y <", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYLessThanOrEqualTo(Integer value) {
            addCriterion("video_y <=", value, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYIn(List<Integer> values) {
            addCriterion("video_y in", values, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYNotIn(List<Integer> values) {
            addCriterion("video_y not in", values, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYBetween(Integer value1, Integer value2) {
            addCriterion("video_y between", value1, value2, "videoY");
            return (Criteria) this;
        }

        public Criteria andVideoYNotBetween(Integer value1, Integer value2) {
            addCriterion("video_y not between", value1, value2, "videoY");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
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