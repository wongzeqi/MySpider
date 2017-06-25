package priv.wzq.spider.model.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefIsNull() {
            addCriterion("blog_content_href is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefIsNotNull() {
            addCriterion("blog_content_href is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefEqualTo(String value) {
            addCriterion("blog_content_href =", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefNotEqualTo(String value) {
            addCriterion("blog_content_href <>", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefGreaterThan(String value) {
            addCriterion("blog_content_href >", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content_href >=", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefLessThan(String value) {
            addCriterion("blog_content_href <", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefLessThanOrEqualTo(String value) {
            addCriterion("blog_content_href <=", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefLike(String value) {
            addCriterion("blog_content_href like", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefNotLike(String value) {
            addCriterion("blog_content_href not like", value, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefIn(List<String> values) {
            addCriterion("blog_content_href in", values, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefNotIn(List<String> values) {
            addCriterion("blog_content_href not in", values, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefBetween(String value1, String value2) {
            addCriterion("blog_content_href between", value1, value2, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogContentHrefNotBetween(String value1, String value2) {
            addCriterion("blog_content_href not between", value1, value2, "blogContentHref");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionIsNull() {
            addCriterion("blog_discription is null");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionIsNotNull() {
            addCriterion("blog_discription is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionEqualTo(String value) {
            addCriterion("blog_discription =", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionNotEqualTo(String value) {
            addCriterion("blog_discription <>", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionGreaterThan(String value) {
            addCriterion("blog_discription >", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("blog_discription >=", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionLessThan(String value) {
            addCriterion("blog_discription <", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("blog_discription <=", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionLike(String value) {
            addCriterion("blog_discription like", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionNotLike(String value) {
            addCriterion("blog_discription not like", value, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionIn(List<String> values) {
            addCriterion("blog_discription in", values, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionNotIn(List<String> values) {
            addCriterion("blog_discription not in", values, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionBetween(String value1, String value2) {
            addCriterion("blog_discription between", value1, value2, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionNotBetween(String value1, String value2) {
            addCriterion("blog_discription not between", value1, value2, "blogDiscription");
            return (Criteria) this;
        }

        public Criteria andBlogSortIsNull() {
            addCriterion("blog_sort is null");
            return (Criteria) this;
        }

        public Criteria andBlogSortIsNotNull() {
            addCriterion("blog_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSortEqualTo(String value) {
            addCriterion("blog_sort =", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortNotEqualTo(String value) {
            addCriterion("blog_sort <>", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortGreaterThan(String value) {
            addCriterion("blog_sort >", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortGreaterThanOrEqualTo(String value) {
            addCriterion("blog_sort >=", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortLessThan(String value) {
            addCriterion("blog_sort <", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortLessThanOrEqualTo(String value) {
            addCriterion("blog_sort <=", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortLike(String value) {
            addCriterion("blog_sort like", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortNotLike(String value) {
            addCriterion("blog_sort not like", value, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortIn(List<String> values) {
            addCriterion("blog_sort in", values, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortNotIn(List<String> values) {
            addCriterion("blog_sort not in", values, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortBetween(String value1, String value2) {
            addCriterion("blog_sort between", value1, value2, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogSortNotBetween(String value1, String value2) {
            addCriterion("blog_sort not between", value1, value2, "blogSort");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNull() {
            addCriterion("blog_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNotNull() {
            addCriterion("blog_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDateEqualTo(String value) {
            addCriterion("blog_date =", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotEqualTo(String value) {
            addCriterion("blog_date <>", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThan(String value) {
            addCriterion("blog_date >", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThanOrEqualTo(String value) {
            addCriterion("blog_date >=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThan(String value) {
            addCriterion("blog_date <", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThanOrEqualTo(String value) {
            addCriterion("blog_date <=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLike(String value) {
            addCriterion("blog_date like", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotLike(String value) {
            addCriterion("blog_date not like", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateIn(List<String> values) {
            addCriterion("blog_date in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotIn(List<String> values) {
            addCriterion("blog_date not in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateBetween(String value1, String value2) {
            addCriterion("blog_date between", value1, value2, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotBetween(String value1, String value2) {
            addCriterion("blog_date not between", value1, value2, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogViewIsNull() {
            addCriterion("blog_view is null");
            return (Criteria) this;
        }

        public Criteria andBlogViewIsNotNull() {
            addCriterion("blog_view is not null");
            return (Criteria) this;
        }

        public Criteria andBlogViewEqualTo(Integer value) {
            addCriterion("blog_view =", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewNotEqualTo(Integer value) {
            addCriterion("blog_view <>", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewGreaterThan(Integer value) {
            addCriterion("blog_view >", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_view >=", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewLessThan(Integer value) {
            addCriterion("blog_view <", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewLessThanOrEqualTo(Integer value) {
            addCriterion("blog_view <=", value, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewIn(List<Integer> values) {
            addCriterion("blog_view in", values, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewNotIn(List<Integer> values) {
            addCriterion("blog_view not in", values, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewBetween(Integer value1, Integer value2) {
            addCriterion("blog_view between", value1, value2, "blogView");
            return (Criteria) this;
        }

        public Criteria andBlogViewNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_view not between", value1, value2, "blogView");
            return (Criteria) this;
        }

        public Criteria andWebIdIsNull() {
            addCriterion("web_id is null");
            return (Criteria) this;
        }

        public Criteria andWebIdIsNotNull() {
            addCriterion("web_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebIdEqualTo(Integer value) {
            addCriterion("web_id =", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotEqualTo(Integer value) {
            addCriterion("web_id <>", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThan(Integer value) {
            addCriterion("web_id >", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_id >=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThan(Integer value) {
            addCriterion("web_id <", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_id <=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdIn(List<Integer> values) {
            addCriterion("web_id in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotIn(List<Integer> values) {
            addCriterion("web_id not in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdBetween(Integer value1, Integer value2) {
            addCriterion("web_id between", value1, value2, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_id not between", value1, value2, "webId");
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