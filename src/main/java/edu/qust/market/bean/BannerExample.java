package edu.qust.market.bean;

import java.util.ArrayList;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public BannerExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andImgIdIsNull() {
            addCriterion("IMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("IMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Long value) {
            addCriterion("IMG_ID =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Long value) {
            addCriterion("IMG_ID <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Long value) {
            addCriterion("IMG_ID >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("IMG_ID >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Long value) {
            addCriterion("IMG_ID <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Long value) {
            addCriterion("IMG_ID <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Long> values) {
            addCriterion("IMG_ID in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Long> values) {
            addCriterion("IMG_ID not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Long value1, Long value2) {
            addCriterion("IMG_ID between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Long value1, Long value2) {
            addCriterion("IMG_ID not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNull() {
            addCriterion("IMG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNotNull() {
            addCriterion("IMG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameEqualTo(String value) {
            addCriterion("IMG_NAME =", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("IMG_NAME <>", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("IMG_NAME >", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_NAME >=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThan(String value) {
            addCriterion("IMG_NAME <", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("IMG_NAME <=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLike(String value) {
            addCriterion("IMG_NAME like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotLike(String value) {
            addCriterion("IMG_NAME not like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameIn(List<String> values) {
            addCriterion("IMG_NAME in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("IMG_NAME not in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("IMG_NAME between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("IMG_NAME not between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgInfoIsNull() {
            addCriterion("IMG_INFO is null");
            return (Criteria) this;
        }

        public Criteria andImgInfoIsNotNull() {
            addCriterion("IMG_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andImgInfoEqualTo(String value) {
            addCriterion("IMG_INFO =", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoNotEqualTo(String value) {
            addCriterion("IMG_INFO <>", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoGreaterThan(String value) {
            addCriterion("IMG_INFO >", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_INFO >=", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoLessThan(String value) {
            addCriterion("IMG_INFO <", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoLessThanOrEqualTo(String value) {
            addCriterion("IMG_INFO <=", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoLike(String value) {
            addCriterion("IMG_INFO like", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoNotLike(String value) {
            addCriterion("IMG_INFO not like", value, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoIn(List<String> values) {
            addCriterion("IMG_INFO in", values, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoNotIn(List<String> values) {
            addCriterion("IMG_INFO not in", values, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoBetween(String value1, String value2) {
            addCriterion("IMG_INFO between", value1, value2, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgInfoNotBetween(String value1, String value2) {
            addCriterion("IMG_INFO not between", value1, value2, "imgInfo");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
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