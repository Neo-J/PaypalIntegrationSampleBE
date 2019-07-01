package org.neo.shopping_cart.controller;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.orders.Order;
import com.paypal.orders.OrdersGetRequest;
import com.paypal.payments.PaymentInstruction;
import com.paypal.payments.RefundRequest;
import org.json.JSONObject;
import org.neo.shopping_cart.paypal.PayPalClient;
import org.neo.shopping_cart.vo.OrderObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by NeoJiang on 27/6/2019.
 */
@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PaymentController extends PayPalClient{

    // Set up the server to receive a call from the client
    /**
     *Method to perform sample GET on an order
     *
     *@throws IOException Exceptions from the API, if any
     */
    @PostMapping("paypal-transaction-complete")
    public boolean getOrder(@RequestBody OrderObject order) throws IOException {
        OrdersGetRequest request = new OrdersGetRequest(order.getOrderID());
        // Call PayPal to get the transaction
        HttpResponse<Order> response = client().execute(request);
        // Save the transaction in your database. Implement logic to save transaction to your database for future reference.
        System.out.println("Full response body:");
        System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
        return true;
    }

}
