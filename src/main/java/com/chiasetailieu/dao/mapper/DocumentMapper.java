package com.chiasetailieu.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chiasetailieu.model.Document;

public class DocumentMapper implements GenericMapper<Document>{

	@Override
	public Document mapRow(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			Document doc = new Document();
			doc.setDocId(rs.getLong("doc_id"));
			doc.setDocName(rs.getString("doc_name"));
			doc.setCateId(rs.getInt("cate_id"));
			doc.setSubcateId(rs.getInt("subcate_id"));
			doc.setUserId(rs.getInt("user_id"));
			doc.setDocSource(rs.getString("doc_source"));
			doc.setCover(rs.getString("doc_cover"));
			return doc;
		} catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
	}

}
