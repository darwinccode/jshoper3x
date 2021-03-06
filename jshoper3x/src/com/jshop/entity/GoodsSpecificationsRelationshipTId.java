package com.jshop.entity;

// Generated 2013-7-26 22:19:04 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GoodsSpecificationsRelationshipTId generated by hbm2java
 */
@Embeddable
public class GoodsSpecificationsRelationshipTId implements java.io.Serializable {

	private String goodsSetId;
	private String specidicationsId;

	public GoodsSpecificationsRelationshipTId() {
	}

	public GoodsSpecificationsRelationshipTId(String goodsSetId,
			String specidicationsId) {
		this.goodsSetId = goodsSetId;
		this.specidicationsId = specidicationsId;
	}

	@Column(name = "GOODS_SET_ID", nullable = false, length = 20)
	public String getGoodsSetId() {
		return this.goodsSetId;
	}

	public void setGoodsSetId(String goodsSetId) {
		this.goodsSetId = goodsSetId;
	}

	@Column(name = "SPECIDICATIONS_ID", nullable = false, length = 200)
	public String getSpecidicationsId() {
		return this.specidicationsId;
	}

	public void setSpecidicationsId(String specidicationsId) {
		this.specidicationsId = specidicationsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GoodsSpecificationsRelationshipTId))
			return false;
		GoodsSpecificationsRelationshipTId castOther = (GoodsSpecificationsRelationshipTId) other;

		return ((this.getGoodsSetId() == castOther.getGoodsSetId()) || (this
				.getGoodsSetId() != null && castOther.getGoodsSetId() != null && this
				.getGoodsSetId().equals(castOther.getGoodsSetId())))
				&& ((this.getSpecidicationsId() == castOther
						.getSpecidicationsId()) || (this.getSpecidicationsId() != null
						&& castOther.getSpecidicationsId() != null && this
						.getSpecidicationsId().equals(
								castOther.getSpecidicationsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGoodsSetId() == null ? 0 : this.getGoodsSetId()
						.hashCode());
		result = 37
				* result
				+ (getSpecidicationsId() == null ? 0 : this
						.getSpecidicationsId().hashCode());
		return result;
	}

}
