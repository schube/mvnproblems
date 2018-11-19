package com.schubec.optitouch.server.servlets;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.schubec.optitouch.shared.ModelService;
import com.schubec.optitouch.shared.ServerResult;
import com.schubec.optitouch.shared.models.Product;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ModelServiceImpl extends RemoteServiceServlet implements ModelService {

	public ModelServiceImpl() {

	}

	@Override
	public ServerResult<List<Product>> getProducts() {
		ServerResult<List<Product>> result = new ServerResult<>();
		List<Product> products = new ArrayList<>();

		Product myProduct = new Product();
		myProduct.setId("1");
		myProduct.setTest("This is a test");

		products.add(myProduct);
		result.setPayload(products);

		return result;
	}
}
