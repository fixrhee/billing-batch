package billing.batch.processor;

import org.json.JSONArray;
import org.json.JSONObject;

public class InvoiceProcessor {

	public String formatItems(String payload) {
		JSONObject jo = new JSONObject(payload);
		JSONArray items = jo.getJSONArray("items");

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < items.length(); i++) {
			sb.append("<tr><td>" + (i + 1) + ".</td><td>" + items.getJSONObject(i).getString("item") + "</td><td>Rp. "
					+ Utils.formatAmount(Integer.parseInt(items.getJSONObject(i).getString("amount")))
					+ ",-</td></tr>");
		}
		return sb.toString();
	}

}
