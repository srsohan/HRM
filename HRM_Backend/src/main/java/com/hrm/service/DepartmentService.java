//package com.hrm.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.hrm.entity.DepartmentEntity;
//import com.hrm.repository.DepartmentRepostiory;
//@Service
//public class DepartmentService {
//	@Autowired
//	DepartmentRepostiory departmentRepository;
//
//	public DepartmentEntity post (DepartmentEntity department) {
//		if (!departmentRepository.equals(null)) {
//
//			return departmentRepository.save(department);
//
//		}
//
//		return null;
//
//	}
//
//	public List<DepartmentEntity> getAllData(){
//		return departmentRepository.findAll();
//	}
//
//	public String delete (Long id) {
//		Optional<DepartmentEntity> mode=departmentRepository.findById(id);
//		if (mode.isPresent()) {
//			departmentRepository.delete(mode.get());
//			return "Success";
//		}
//
//		return "Failed";
//
//	}
//
//public DepartmentEntity update(DepartmentEntity department, long id) {
//	Optional<DepartmentEntity> deptOptional = departmentRepository.findById(id);
//	DepartmentEntity deptEntity = new DepartmentEntity();
//
//	if (deptOptional.isPresent()) {
//		deptEntity.setDepartmentName(department.getDepartmentName());
//		deptEntity.setDepartmentCode(department.getDepartmentCode());
//	}else {
//		department.setId(id);
//
//	}
//	return departmentRepository.save(deptEntity);
//
//}
//
//}
//
//
//
//
//
//
//////deleteData
////public String delete(Long id ) {
////	Optional<CatagoryEntity> mode=catagoryRepository.findById(id);
////
////
////	if(mode.isPresent()) {
////		catagoryRepository.delete(mode.get());
////
////		return "finalStatus";
////	}
////
////	return "Failed";
////}
////updatedata1
//
////Optional<CatagoryEntity> catOptional = catagoryRepository.findById(id);
////
////CatagoryEntity cataEntity = new CatagoryEntity();
////if (catOptional.isEmpty()) {
////
////  cataEntity.setCat_code(catagoryEntity.getCat_code());
////  cataEntity.setCat_name(catagoryEntity.getCat_name());
////  cataEntity.setFood_description(catagoryEntity.getFood_description());
////  cataEntity.setFood_orgin(catagoryEntity.getFood_orgin());
////  return catagoryRepository.save(cataEntity);
////
////}else {
////  cataEntity.setId(id);
////  return catagoryRepository.save(cataEntity);
////}
//
//
//
//////updateData 2
////public CatagoryEntity update(CatagoryEntity catagoryEntity ,long id) {
////
////catagoryRepository.findById(id).map(cat->{
////	cat.setCat_code(cat.getCat_code());
////	cat.setCat_name(cat.getCat_name());
////	cat.setFood_description(cat.getFood_description());
////	cat.setFood_orgin(cat.getFood_orgin());
////	return catagoryRepository.save(cat);
////}
////).orElseGet(()->{
////	catagoryEntity.setId(id);
////	return catagoryRepository.save(catagoryEntity);
////});
////
////	return null;
////
////}
//////one id
////public CatagoryEntity getById(Long id) {
////	Optional<CatagoryEntity> mode=catagoryRepository.findById(id);
////
////
////
////
////	return mode.get();
//
////}
//
//
//
