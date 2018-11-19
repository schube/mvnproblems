package com.schubec.optitouch.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.schubec.optitouch.shared.ModelService;
import com.schubec.optitouch.shared.ModelServiceAsync;
import com.schubec.optitouch.shared.ServerResult;
import com.schubec.optitouch.shared.models.Product;

public class OptiTouch implements EntryPoint {
	private final ModelServiceAsync modelService = GWT.create(ModelService.class);

	public void onModuleLoad() {
		loadProductsFromServer(new Command() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Hole ALLE Produkte vom Server und speichert sie in einer Membervariable am
	 * Client!
	 */
	public void loadProductsFromServer(final Command doneCallback) {

		modelService.getProducts(new AsyncCallback<ServerResult<List<Product>>>() {
			@Override
			public void onFailure(Throwable caught) {
				throw new RuntimeException("Couldnt call 'getProducts'", caught);
			}

			@Override
			public void onSuccess(ServerResult<List<Product>> result) {

				Window.alert("Data from Server: " + result.getPayload().get(0).getTest());
				doneCallback.execute();
			}
		});
	}

}
