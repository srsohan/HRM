import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ResetPasswordComponent } from './components/reset-password/reset-password.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FooterComponent } from './layouts/footer/footer.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from "./layouts/header/header.component";
import { SidebarComponent } from './layouts/sidebar/sidebar.component';
import { AllProjectsComponent } from './sub-components/all-projects/all-projects.component';
import { AddProjectsComponent } from './sub-components/add-projects/add-projects.component';
import { AllEmployeeComponent } from './sub-components/all-employee/all-employee.component';
import { AddClientsComponent } from './sub-components/add-clients/add-clients.component';
import { AddHolidaysComponent } from './sub-components/add-holidays/add-holidays.component';
import { AllHolidaysComponent } from './sub-components/all-holidays/all-holidays.component';
import { AllDepartmentsComponent } from './sub-components/all-departments/all-departments.component';
import { AddDepartmentComponent } from './sub-components/add-department/add-department.component';
import { AllPaymentsComponent } from './sub-components/all-payments/all-payments.component';
import { AddPaymentsComponent } from './sub-components/add-payments/add-payments.component';
import { InvoiceComponent } from './sub-components/invoice/invoice.component';
import { PayslipComponent } from './sub-components/payslip/payslip.component';
import { EmployeeSalaryComponent } from './sub-components/employee-salary/employee-salary.component';
import { RequirementsComponent } from './sub-components/requirements/requirements.component';
import { CandidatesComponent } from './sub-components/candidates/candidates.component';
import { TodaysAttendanceComponent } from './sub-components/todays-attendance/todays-attendance.component';
import { AttendanceSheetComponent } from './sub-components/attendance-sheet/attendance-sheet.component';
import { LeaveBalanceComponent } from './sub-components/leave-balance/leave-balance.component';
import { AddLeaveReqComponent } from './sub-components/add-leave-req/add-leave-req.component';
import { LeaveTypeComponent } from './sub-components/leave-type/leave-type.component';
import { AddJobsComponent } from './sub-components/add-jobs/add-jobs.component';
import { CalenderComponent } from './tools-components/calender/calender.component';
import { TasksComponent } from './tools-components/tasks/tasks.component';
import { UsersProfileComponent } from './tools-components/users-profile/users-profile.component';
import { PagesLoginComponent } from './tools-components/pages-login/pages-login.component';
import { PagesContactComponent } from './tools-components/pages-contact/pages-contact.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { UserSidebarComponent } from './layouts/user-sidebar/user-sidebar.component';
import { UserHeaderComponent } from './layouts/user-header/user-header.component';
import { HomeComponent } from './components/home/home.component';
import { UserHomeComponent } from './components/user-home/user-home.component';

@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        ResetPasswordComponent,
        NotFoundComponent,
        FooterComponent,
        HeaderComponent,
        DashboardComponent,
        SidebarComponent,
        AllProjectsComponent,
        AddProjectsComponent,
        AllEmployeeComponent,
        AddClientsComponent,
        AddHolidaysComponent,
        AllHolidaysComponent,
        AllDepartmentsComponent,
        AddDepartmentComponent,
        AllPaymentsComponent,
        AddPaymentsComponent,
        InvoiceComponent,
        PayslipComponent,
        EmployeeSalaryComponent,
        RequirementsComponent,
        CandidatesComponent,
        TodaysAttendanceComponent,
        AttendanceSheetComponent,
        LeaveBalanceComponent,
        AddLeaveReqComponent,
        LeaveTypeComponent,
        AddJobsComponent,
        CalenderComponent,
        TasksComponent,
        UsersProfileComponent,
        PagesLoginComponent,
        PagesContactComponent,
        UserDashboardComponent,
        UserSidebarComponent,
        UserHeaderComponent,
        HomeComponent,
        UserHomeComponent
    ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FontAwesomeModule,
        FontAwesomeModule,
    
    ]
})
export class AppModule { }
