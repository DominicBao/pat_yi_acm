package acm;

public class Learn {

	public static void main(String[] args) {
		String a = "zhice_anti_fraud_depend_table,zc_result_orginal,zc_input_params,zc_report_context_dt,zc_report_data_dt,zhice_std_input_split_table_dt,zc_report_context,zc_report_data,zc_report_config,alita_province_info,alita_pre_loan_duotou_stat_dt,zc_3_report_input_dt,jcyq_loan_current_month_dt,jcyq_loan_data_id_mt,all_type_preloan,dwb_prd_zc_result_explode_dt,dwb_prd_zc_result_split_dt,dwb_prd_zc_input_split_dt,duotou_table_loan1719,alita_pre_loan_output_dt";
		String[] b = a.split(",");
		for(int i = 0;i < a.length();i++) {
			System.out.println(b[i]);
		}

	}

}
