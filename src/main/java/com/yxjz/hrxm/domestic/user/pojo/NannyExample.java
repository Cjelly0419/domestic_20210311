package com.yxjz.hrxm.domestic.user.pojo;

import java.util.ArrayList;
import java.util.List;

public class NannyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public NannyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNNameIsNull() {
            addCriterion("n_name is null");
            return (Criteria) this;
        }

        public Criteria andNNameIsNotNull() {
            addCriterion("n_name is not null");
            return (Criteria) this;
        }

        public Criteria andNNameEqualTo(String value) {
            addCriterion("n_name =", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotEqualTo(String value) {
            addCriterion("n_name <>", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThan(String value) {
            addCriterion("n_name >", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_name >=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThan(String value) {
            addCriterion("n_name <", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThanOrEqualTo(String value) {
            addCriterion("n_name <=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLike(String value) {
            addCriterion("n_name like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotLike(String value) {
            addCriterion("n_name not like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameIn(List<String> values) {
            addCriterion("n_name in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotIn(List<String> values) {
            addCriterion("n_name not in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameBetween(String value1, String value2) {
            addCriterion("n_name between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotBetween(String value1, String value2) {
            addCriterion("n_name not between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andNAgeIsNull() {
            addCriterion("n_age is null");
            return (Criteria) this;
        }

        public Criteria andNAgeIsNotNull() {
            addCriterion("n_age is not null");
            return (Criteria) this;
        }

        public Criteria andNAgeEqualTo(Integer value) {
            addCriterion("n_age =", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotEqualTo(Integer value) {
            addCriterion("n_age <>", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeGreaterThan(Integer value) {
            addCriterion("n_age >", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_age >=", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeLessThan(Integer value) {
            addCriterion("n_age <", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeLessThanOrEqualTo(Integer value) {
            addCriterion("n_age <=", value, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeIn(List<Integer> values) {
            addCriterion("n_age in", values, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotIn(List<Integer> values) {
            addCriterion("n_age not in", values, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeBetween(Integer value1, Integer value2) {
            addCriterion("n_age between", value1, value2, "nAge");
            return (Criteria) this;
        }

        public Criteria andNAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_age not between", value1, value2, "nAge");
            return (Criteria) this;
        }

        public Criteria andNTelIsNull() {
            addCriterion("n_tel is null");
            return (Criteria) this;
        }

        public Criteria andNTelIsNotNull() {
            addCriterion("n_tel is not null");
            return (Criteria) this;
        }

        public Criteria andNTelEqualTo(String value) {
            addCriterion("n_tel =", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelNotEqualTo(String value) {
            addCriterion("n_tel <>", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelGreaterThan(String value) {
            addCriterion("n_tel >", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelGreaterThanOrEqualTo(String value) {
            addCriterion("n_tel >=", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelLessThan(String value) {
            addCriterion("n_tel <", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelLessThanOrEqualTo(String value) {
            addCriterion("n_tel <=", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelLike(String value) {
            addCriterion("n_tel like", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelNotLike(String value) {
            addCriterion("n_tel not like", value, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelIn(List<String> values) {
            addCriterion("n_tel in", values, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelNotIn(List<String> values) {
            addCriterion("n_tel not in", values, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelBetween(String value1, String value2) {
            addCriterion("n_tel between", value1, value2, "nTel");
            return (Criteria) this;
        }

        public Criteria andNTelNotBetween(String value1, String value2) {
            addCriterion("n_tel not between", value1, value2, "nTel");
            return (Criteria) this;
        }

        public Criteria andNContractIdIsNull() {
            addCriterion("n_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andNContractIdIsNotNull() {
            addCriterion("n_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andNContractIdEqualTo(Integer value) {
            addCriterion("n_contract_id =", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdNotEqualTo(Integer value) {
            addCriterion("n_contract_id <>", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdGreaterThan(Integer value) {
            addCriterion("n_contract_id >", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_contract_id >=", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdLessThan(Integer value) {
            addCriterion("n_contract_id <", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_contract_id <=", value, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdIn(List<Integer> values) {
            addCriterion("n_contract_id in", values, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdNotIn(List<Integer> values) {
            addCriterion("n_contract_id not in", values, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdBetween(Integer value1, Integer value2) {
            addCriterion("n_contract_id between", value1, value2, "nContractId");
            return (Criteria) this;
        }

        public Criteria andNContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_contract_id not between", value1, value2, "nContractId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nanny
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 19 09:05:23 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nanny
     *
     * @mbggenerated Fri Feb 19 09:05:23 CST 2021
     */
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