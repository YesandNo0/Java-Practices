import java.util.ArrayList;
import java.util.List;

@lombok.Data
public class Data {
    private List<Product> products;

    public Data() {
        this.products = new ArrayList<>();
    }

    public boolean addProduct(Product product) {
        if(product == null) return false;
        return products.add(product);
    }

    public Product findProductById(int id) {
        for (Product product : products) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findProductByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if(product.getName().equals(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> findProductByCategory(String categoryName) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if(product.getCategory().getName().equals(categoryName)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Товари{" +  products + '}';
    }
}
