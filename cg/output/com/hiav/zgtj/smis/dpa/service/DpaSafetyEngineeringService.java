package com.hiav.zgtj.smis.dpa.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bstek.bdf2.core.business.IUser;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.bstek.uflo.client.service.ProcessClient;
import com.bstek.uflo.service.StartProcessInfo;

@Service
public class DpaSafetyEngineeringService extends BaseService<DpaSafetyEngineering> {
    
	@Autowired
	private UserHelperService userHelperService;
	
	@SuppressWarnings("rawtypes")
	@Override
	public void find(Page<DpaSafetyEngineering> page, Map<String, Object> params,
			Criteria filterCriteria) {

		StringBuilder sql = new StringBuilder(" select e.* FROM dpa_safety_engineering e ")
			//.append(" left join pm_project p on e.project_id = p.id ")
			.append(" where e.deleted=0 ");
		Map<String, Class> e = new HashMap<String, Class>();
		e.put("e", DpaSafetyEngineering.class);
		
		Map<String, Object> p = new HashMap<String, Object>();
		if (params != null) {
			// 审批功能用到，审批时只允许查唯一的业务Id
			String businessId = (String) params.get("businessId");
			if (StringUtils.isNotBlank(businessId)) {
				sql.append(" AND e.id = :businessId");
				p.put("businessId", businessId);
			}
			
		}
		/*
		//过滤项目
		List<String> userProjectDeptIds = userHelperService.userProjectDeptIds();
		if(userProjectDeptIds==null||userProjectDeptIds.isEmpty()){
			sql.append(" and p.id is null ");
		}else{
			sql.append(" and p.dept_id in ( ");
			for(int i=0;i<userProjectDeptIds.size();i++){
				if(i>0){
					sql.append(",");
				}
				sql.append(":deptId__"+i);
				p.put("deptId__"+i, userProjectDeptIds.get(i));
			}
			sql.append(" ) ");
		}
		*/
		sql.append(" ORDER BY e.creation_date desc ");
		new SqlFinder(sql.toString(), p, e).setFilterCriteria(filterCriteria).find(
				page);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Collection<DpaSafetyEngineering> find(Map<String, Object> params) {


		StringBuilder sql = new StringBuilder(" select e.* FROM dpa_safety_engineering e ")
			//.append(" left join pm_project p on e.project_id = p.id ")
			.append(" where e.deleted=0 ");
		Map<String, Class> e = new HashMap<String, Class>();
		e.put("e", DpaSafetyEngineering.class);
		
		Map<String, Object> p = new HashMap<String, Object>();
		if (params != null) {
			// 审批功能用到，审批时只允许查唯一的业务Id
			String businessId = (String) params.get("businessId");
			if (StringUtils.isNotBlank(businessId)) {
				sql.append(" AND e.id = :businessId");
				p.put("businessId", businessId);
			}
			
		}
		/*
		//过滤项目
		List<String> userProjectDeptIds = userHelperService.userProjectDeptIds();
		if(userProjectDeptIds==null||userProjectDeptIds.isEmpty()){
			sql.append(" and p.id is null ");
		}else{
			sql.append(" and p.dept_id in ( ");
			for(int i=0;i<userProjectDeptIds.size();i++){
				if(i>0){
					sql.append(",");
				}
				sql.append(":deptId__"+i);
				p.put("deptId__"+i, userProjectDeptIds.get(i));
			}
			sql.append(" ) ");
		}
		*/
		sql.append(" ORDER BY e.creation_date desc ");

		return new SqlFinder(sql.toString(), p, e).setFilterCriteria(null)
				.findAll();
	}
	
	// 逻辑删除
	public void delete(String id) {
		DpaSafetyEngineering x = (DpaSafetyEngineering) this.getCurrentSession().get(
				DpaSafetyEngineering.class, id);
		x.setDeleted(true);
				this.update(x);
	}

	@Override
	public void save(Collection<DpaSafetyEngineering> datas) {
		IUser marker = ContextHolder.getLoginUser();
		Date markTime = new Date();
		Session session = this.getCurrentSession();
		
		for (DpaSafetyEngineering x : datas) {
			
			EntityState state = EntityUtils.getState(x);
			
			if (state.equals(EntityState.NEW)) {
				/*x.setCompanyId(marker.getCompanyId());*/
				x.setCreatedBy(marker.getCname());
				x.setCreationDate(markTime);
				session.save(x);
			} else if (state.equals(EntityState.MODIFIED)|| state.equals(EntityState.MOVED)) {
				x.setLastUpdateBy(marker.getCname());
				x.setLastUpdateDate(markTime);
				session.update(x);
			} else if (state.equals(EntityState.DELETED)) {
				// 是否可以删除，已在删除前作了检查
				x.setDeleted(true);
				this.update(x);
			}
			
		}
	}

}