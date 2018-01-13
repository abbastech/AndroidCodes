
package com.example.android.finalexampractice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offer {

    @SerializedName("offer_id")
    @Expose
    private String offerId;
    @SerializedName("offer_author")
    @Expose
    private String offerAuthor;
    @SerializedName("offer_type")
    @Expose
    private String offerType;
    @SerializedName("offer_name")
    @Expose
    private String offerName;
    @SerializedName("offer_title")
    @Expose
    private String offerTitle;
    @SerializedName("offer_description")
    @Expose
    private String offerDescription;
    @SerializedName("offer_parent")
    @Expose
    private String offerParent;
    @SerializedName("offer_date")
    @Expose
    private String offerDate;
    @SerializedName("offer_updated_date")
    @Expose
    private String offerUpdatedDate;
    @SerializedName("offer_status")
    @Expose
    private String offerStatus;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("city_id")
    @Expose
    private List<String> cityId = null;
    @SerializedName("offer_expiry")
    @Expose
    private String offerExpiry;
    @SerializedName("offer_rating")
    @Expose
    private String offerRating;
    @SerializedName("store_id")
    @Expose
    private String storeId;
    @SerializedName("sub_pages_count")
    @Expose
    private String subPagesCount;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("offer_total_reviews")
    @Expose
    private Integer offerTotalReviews;
    @SerializedName("offer_total_ratings")
    @Expose
    private Integer offerTotalRatings;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferAuthor() {
        return offerAuthor;
    }

    public void setOfferAuthor(String offerAuthor) {
        this.offerAuthor = offerAuthor;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferParent() {
        return offerParent;
    }

    public void setOfferParent(String offerParent) {
        this.offerParent = offerParent;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getOfferUpdatedDate() {
        return offerUpdatedDate;
    }

    public void setOfferUpdatedDate(String offerUpdatedDate) {
        this.offerUpdatedDate = offerUpdatedDate;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getCityId() {
        return cityId;
    }

    public void setCityId(List<String> cityId) {
        this.cityId = cityId;
    }

    public String getOfferExpiry() {
        return offerExpiry;
    }

    public void setOfferExpiry(String offerExpiry) {
        this.offerExpiry = offerExpiry;
    }

    public String getOfferRating() {
        return offerRating;
    }

    public void setOfferRating(String offerRating) {
        this.offerRating = offerRating;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getSubPagesCount() {
        return subPagesCount;
    }

    public void setSubPagesCount(String subPagesCount) {
        this.subPagesCount = subPagesCount;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getOfferTotalReviews() {
        return offerTotalReviews;
    }

    public void setOfferTotalReviews(Integer offerTotalReviews) {
        this.offerTotalReviews = offerTotalReviews;
    }

    public Integer getOfferTotalRatings() {
        return offerTotalRatings;
    }

    public void setOfferTotalRatings(Integer offerTotalRatings) {
        this.offerTotalRatings = offerTotalRatings;
    }

}
