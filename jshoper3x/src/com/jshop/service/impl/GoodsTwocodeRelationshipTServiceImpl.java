package com.jshop.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jshop.dao.GoodsTwocodeRelationshipTDao;
import com.jshop.entity.GoodsTwocodeRelationshipT;
import com.jshop.service.GoodsTwocodeRelationshipTService;
@Service("goodsTwocodeRelationshipTService")
@Scope("prototype")
public class GoodsTwocodeRelationshipTServiceImpl implements
		GoodsTwocodeRelationshipTService {
	@Resource
	private GoodsTwocodeRelationshipTDao goodsTwocodeRelationshipTDao;
	

	public GoodsTwocodeRelationshipTDao getGoodsTwocodeRelationshipTDao() {
		return goodsTwocodeRelationshipTDao;
	}


	public void setGoodsTwocodeRelationshipTDao(
			GoodsTwocodeRelationshipTDao goodsTwocodeRelationshipTDao) {
		this.goodsTwocodeRelationshipTDao = goodsTwocodeRelationshipTDao;
	}


	@Override
	public int addGoodsQRCode(GoodsTwocodeRelationshipT qrcode) {
		
		return this.getGoodsTwocodeRelationshipTDao().addGoodsQRCode(qrcode);
	}


	@Override
	public GoodsTwocodeRelationshipT findGoodsQRCodeByGoodsid(String goodsid) {
		
		return this.getGoodsTwocodeRelationshipTDao().findGoodsQRCodeByGoodsid(goodsid);
	}


	@Override
	public int updateGoodsQRCode(String goodsid, String twocodepath) {
		
		return this.getGoodsTwocodeRelationshipTDao().updateGoodsQRCode(goodsid, twocodepath);
	}

}
