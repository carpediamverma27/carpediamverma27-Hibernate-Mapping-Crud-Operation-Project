package com.ty.service;

import java.util.List;

import com.ty.dao.imp.BranchDaoImp;
import com.ty.dto.Branch;

public class BranchService {

	public void saveBranch(int hid, Branch branch)
	{
		BranchDaoImp branchDaoImp  = new  BranchDaoImp();
		Branch branch1 = branchDaoImp.saveBranch(hid, branch);
		if(branch1!=null)
		{
			System.out.println("Branch save Susseccfully");
		}
		else {
			System.out.println("Unfortunately Branch not Saved");
		}
		
	}
	
	public void deleteBranchById(int bid) 
	{
		BranchDaoImp branchDaoImp  = new BranchDaoImp();
		boolean flag = branchDaoImp.deleteBranchById(bid);
		
		if(flag)
		{
			System.out.println("Branch Deleted Successfully ");
		}
		else {
			System.out.println("Branch Not Deleted");
		}
	}
	
	public Branch updateBranchById(int bid, Branch branch)
	{
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		Branch branch2 = branchDaoImp.updateBranchById(bid, branch);
		
		if(branch2!=null) {
			System.out.println("Branch Updated Successfully");
		}
		else {
			System.out.println("Branch not Updated");
		}
		return null;
	}
	
	public Branch getBranchById(int bid)
	{
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		Branch branch = branchDaoImp.getBranchById(bid);
		if(branch!=null) {
			return branch;
		}
		else {
			return null;
		}
	}
	
	public List<Branch> getAllBranch()
	{
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		List<Branch> branch = branchDaoImp.getAllBranch();
		if(branch.size()>0)
		{
			return branch;
		}
		else
		{
			return null;
		}
		
	}
}
