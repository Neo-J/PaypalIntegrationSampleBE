package org.neo.shopping_cart.paypal;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;

/**
 * Created by NeoJiang on 29/6/2019.
 */
public class PayPalClient {

    /**
     *Set up the PayPal Java SDK environment with PayPal access credentials.
     *This sample uses SandboxEnvironment. In production, use LiveEnvironment.
     */
    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
            "AfBkoHOfVrFDfW5pv9AkJihXMoMwzUiDtBlzIciZdCI8ZocGI0mTz1H_-Fw8iJFxxhmZR7VPFdI5kd7y",
            "EJrQbfkGGoS8Ci2B31Dn5CADKo7-oZ_8kZKP55CnsYVkcOQlHU-p2WTkwTBt2s2eG4H6fLSVdZK3XL-v");

    /**
     *PayPal HTTP client instance with environment that has access
     *credentials context. Use to invoke PayPal APIs.
     */
    PayPalHttpClient client = new PayPalHttpClient(environment);

    /**
     *Method to get client object
     *
     *@return PayPalHttpClient client
     */
    public PayPalHttpClient client() {
        return this.client;
    }
}
