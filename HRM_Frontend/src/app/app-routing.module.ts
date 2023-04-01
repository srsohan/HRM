import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { AddClientsComponent } from './sub-components/add-clients/add-clients.component';
import { AddDepartmentComponent } from './sub-components/add-department/add-department.component';
import { AddEmployeeComponent } from './sub-components/add-employee/add-employee.component';
import { AddHolidaysComponent } from './sub-components/add-holidays/add-holidays.component';
import { AddJobsComponent } from './sub-components/add-jobs/add-jobs.component';
import { AddLeaveReqComponent } from './sub-components/add-leave-req/add-leave-req.component';
import { AddPaymentsComponent } from './sub-components/add-payments/add-payments.component';
import { AddProjectsComponent } from './sub-components/add-projects/add-projects.component';
import { AllClientsComponent } from './sub-components/all-clients/all-clients.component';
import { AllDepartmentsComponent } from './sub-components/all-departments/all-departments.component';
import { AllEmployeeComponent } from './sub-components/all-employee/all-employee.component';
import { AllHolidaysComponent } from './sub-components/all-holidays/all-holidays.component';
import { AllLeaveReqComponent } from './sub-components/all-leave-req/all-leave-req.component';
import { AllPaymentsComponent } from './sub-components/all-payments/all-payments.component';
import { AllProjectsComponent } from './sub-components/all-projects/all-projects.component';
import { AttendanceSheetComponent } from './sub-components/attendance-sheet/attendance-sheet.component';
import { CandidatesComponent } from './sub-components/candidates/candidates.component';
import { EmployeeSalaryComponent } from './sub-components/employee-salary/employee-salary.component';
import { InvoiceComponent } from './sub-components/invoice/invoice.component';
import { LeaveBalanceComponent } from './sub-components/leave-balance/leave-balance.component';
import { LeaveTypeComponent } from './sub-components/leave-type/leave-type.component';
import { PayslipComponent } from './sub-components/payslip/payslip.component';
import { RequirementsComponent } from './sub-components/requirements/requirements.component';
import { TodaysAttendanceComponent } from './sub-components/todays-attendance/todays-attendance.component';
import { CalenderComponent } from './tools-components/calender/calender.component';
import { PagesContactComponent } from './tools-components/pages-contact/pages-contact.component';
import { TasksComponent } from './tools-components/tasks/tasks.component';
import { UsersProfileComponent } from './tools-components/users-profile/users-profile.component';

const routes: Routes = [
  {path: 'login', component:LoginComponent},
  {path: 'home', component:HomeComponent,
  children:[
    {
      path: '', component:DashboardComponent
    },
    {
      path: 'allProjects', component:AllProjectsComponent
    },
    {
      path: 'addProjects', component:AddProjectsComponent
    },
    {
      path: 'allEmployee', component:AllEmployeeComponent
    },
    {
      path: 'addEmployee', component:AddEmployeeComponent
    },
    {
      path: 'todayAttendance', component:TodaysAttendanceComponent
    },
    {
      path: 'attendanceSheet', component:AttendanceSheetComponent
    },
    {
      path: 'allClients', component:AllClientsComponent
    },
    {
      path: 'addClients', component:AddClientsComponent
    },
    {
      path: 'addClients', component:AddClientsComponent
    },
    {
      path: 'allLeaveRequest', component:AllLeaveReqComponent
    },
    {
      path: 'leaveBalance', component:LeaveBalanceComponent
    },
    {
      path: 'addLeaveRequest', component:AddLeaveReqComponent
    },
    {
      path: 'leaveType', component:LeaveTypeComponent
    },
    {
      path: 'allHolidays', component:AllHolidaysComponent
    },
    {
      path: 'addHolidays', component:AddHolidaysComponent
    },
    {
      path: 'allPayments', component:AllPaymentsComponent
    },
    {
      path: 'addPayments', component:AddPaymentsComponent
    },
    {
      path: 'invoice', component:InvoiceComponent
    },
    {
      path: 'allDepartments', component:AllDepartmentsComponent
    },
    {
      path: 'addDepartment', component:AddDepartmentComponent
    },
    {
      path: 'employeeSalary', component:EmployeeSalaryComponent
    },
    {
      path: 'payslip', component:PayslipComponent
    },
    {
      path: 'addJobs', component:AddJobsComponent
    },
    {
      path: 'requirements', component:RequirementsComponent
    },
    {
      path: 'candidates', component:CandidatesComponent
    },
    {
      path: 'calender', component:CalenderComponent
    },
    {
      path: 'tasks', component:TasksComponent
    },
    {
      path: 'user-profile', component:UsersProfileComponent
    },
    {
      path: 'pages-contact', component:PagesContactComponent
    },
    {
      path: 'login', component:LoginComponent
    },
    {
      path: 'user-dashboard', component:LoginComponent
    },
    
  ]


},
  {path: 'home', component:HomeComponent},
  {path: 'reset-password', component:ResetPasswordComponent},
  {path: '', redirectTo:'home', pathMatch: 'full'},
  {path: '**', component:NotFoundComponent},
  {path: 'add-employee', component:AddEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
