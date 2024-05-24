package com.FTG2024.hrms.leaves.model

data class LeavesApproval(val name : String,
                          val date : String,
                          val leaveType : String,
                          val appliedOn : String,
                          val remark : String,
                          val status :String)
