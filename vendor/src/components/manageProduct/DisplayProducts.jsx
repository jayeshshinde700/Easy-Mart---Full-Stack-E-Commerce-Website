import React, { useState } from "react";
import { Link } from "react-router-dom";

export default function DisplayProducts(props) {
  let products = props.allProducts;

  const [selectedProductId, setSelectedProductId] = useState(null);

  return (
    <div className="container mt-5">
      <table className="table table-hover table-bordered">
        <thead>
          <tr className="text-center">
            <th scope="col">ID</th>
            <th scope="col">IMAGE</th>
            <th scope="col">NAME</th>
            <th scope="col">PRICE</th>
            <th scope="col">QUANTITY</th>
            <th scope="col">BRAND</th>
            <th scope="col">DESCRIPTION</th>
            <th scope="col" colSpan={2}>
              ACTION
            </th>
          </tr>
        </thead>

        <tbody className="table-group-divider">
          {products ? (
            products.map((product) => {
              return (
                <tr key={product.id}>
                  <td>{product.id}</td>

                  <td>
                    <img
                      src={`http://localhost:8080/api/v1/images/${product.imageName}`}
                      alt={product.name}
                      style={{ height: "50px", width: "50px" }}
                    />
                  </td>
                  <td className="text-capitalize">{product.name}</td>
                  <td>{product.price}</td>
                  <td>{product.quantity}</td>
                  <td className="text-capitalize">{product.brand}</td>
                  <td className="text-capitalize">
                    {product.description}
                  </td>

                  <td className='text-capitalize text-center'>
                    <Link to={`/update-product/${product.id}`} className='btn btn-primary'>Update</Link>
                  </td>

                  <td className="text-center">
                    <button
                      className="btn btn-danger"
                      type="button"
                      data-bs-toggle="modal"
                      data-bs-target="#exampleModal"
                      onClick={() => setSelectedProductId(product.id)}> Delete</button>
                  </td>
                </tr>
              );
            })
          ) : (
            <tr>
              <td colSpan="8" className="text-center">
                Loading Products...
              </td>
            </tr>
          )}
        </tbody>
      </table>

      {/* Delete Modal */}

      <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div className="modal-dialog">
            <div className="modal-content">
              <div className="modal-header">
                <h1 className="modal-title fs-5" id="exampleModalLabel">Delete Product?</h1>
                <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div className="modal-body">
                This action will delete product permanantly!
              </div>
              <div className="modal-footer">
                <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" className="btn btn-danger" data-bs-dismiss="modal" onClick={()=>{props.onDeleteProduct(selectedProductId)}}>Delete</button>
              </div>
            </div>
          </div>
        </div>

    </div>
  );
}