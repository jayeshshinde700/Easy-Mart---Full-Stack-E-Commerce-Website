import React, { useEffect, useState } from "react";
import DisplayProducts from "./DisplayProducts";
import { toast } from "react-toastify";

export default function FetchProducts() {

  const [products, setProducts] = useState(null);

  let loggedInVendor = JSON.parse(localStorage.getItem("user"));

  // Get all products
  async function getProductsByVendorId() {

    let response = await fetch(
      `http://localhost:8080/api/v1/vendor/products/${loggedInVendor.id}`,
      {
        headers: {
          Authorization: `Bearer ${loggedInVendor.token}`,
        },
      }
    );

    let responseObject = await response.json();

    setProducts(responseObject.data);
  }

  useEffect(() => {
    getProductsByVendorId();
  }, []);

  // Delete Product
  async function deleteProduct(productId) {

    let response = await fetch(
      `http://localhost:8080/api/v1/vendor/${loggedInVendor.id}/products/${productId}`,
      {
        method: "DELETE",
        headers: {
          Authorization: `Bearer ${loggedInVendor.token}`,
        },
      }
    );

    let responseObject = await response.json();

    if (response.ok) {
      toast.success(responseObject.message);
      getProductsByVendorId();
    } else {
      toast.error(responseObject.message);
    }
  }

  return (
    <div>
      {products == null ? (
        <h1>There are no products, please add some!</h1>
      ) : (
        <DisplayProducts
          allProducts={products}
          onDeleteProduct={deleteProduct}
        />
      )}
    </div>
  );
}