CREATE DATABASE BEEFIT;
USE BEEFIT;

CREATE TABLE category (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE brand (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE design (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE neck_type (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE hand_type (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE product (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30),
    name NVARCHAR(100),
    weight FLOAT,
    price DECIMAL(19,4),
    discount INT,
    discount_date DATETIME,
    description NVARCHAR(1000),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    brand_id INT,
    category_id INT,
    neck_type_id INT,
    hand_type_id INT,
    design_id INT,
    FOREIGN KEY (brand_id) REFERENCES brand(id),
    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (neck_type_id) REFERENCES neck_type(id),
    FOREIGN KEY (hand_type_id) REFERENCES hand_type(id),
    FOREIGN KEY (design_id) REFERENCES design(id)
);
CREATE TABLE product_image (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    url NVARCHAR(255),
    main_image BIT,
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    product_id INT,
    FOREIGN KEY (product_id) REFERENCES product(id)
);
CREATE TABLE material (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE productdetail_material (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    product_id INT,
    material_id INT,
    FOREIGN KEY (product_id) REFERENCES product(id),
    FOREIGN KEY (material_id) REFERENCES material(id)
);
CREATE TABLE size (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE color (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(100),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE productdetail_color_size (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    product_id INT,
    color_id INT,
    size_id INT,
    quantity INT,
    FOREIGN KEY (product_id) REFERENCES product(id),
    FOREIGN KEY (color_id) REFERENCES Color(id),
    FOREIGN KEY (size_id) REFERENCES Size(id)
);
CREATE TABLE role (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name NVARCHAR(50),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE Employee (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30) UNIQUE,
    fullname NVARCHAR(100),
    username VARCHAR(30) UNIQUE,
    password VARCHAR(30),
    image VARCHAR(255),
    gender BIT,
    phone VARCHAR(15),
    email VARCHAR(50),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    role_id INT,
    FOREIGN KEY (role_id) REFERENCES role(id)
);
CREATE TABLE Customer (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30) UNIQUE,
    fullname NVARCHAR(100),
    username VARCHAR(30) UNIQUE,
    password VARCHAR(30),
    image VARCHAR(255),
    gender BIT,
    phone VARCHAR(15),
    email VARCHAR(50),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE voucher (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30),
    name NVARCHAR(100),
    discount_type BIT,
    discount INT,
    cash DECIMAL(19,4),
    start_date DATETIME,
    end_date DATETIME,
    quantity INT,
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT
);
CREATE TABLE address (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    fullname NVARCHAR(100),
    phone VARCHAR(15),
    address NVARCHAR(255),
    city_name NVARCHAR(100),
    district_name NVARCHAR(100),
    ward_name NVARCHAR(100),
    city_id INT,
    district_id INT,
    ward_id INT,
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
CREATE TABLE bill (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30),
    purchase_date DATETIME,
    estimated_date DATETIME,
    payment_date DATETIME,
    delivery_date DATETIME,
    total_price DECIMAL(19,4),
    ship_price DECIMAL(19,4),
    total_price_last DECIMAL(19,4),
    note NVARCHAR(255),
    pay_type INT,
    pay_status INT,
    type_status INT,
    status INT,
    code_ghn VARCHAR(30),
    coupon_id INT,
    address_id INT,
    customer_id INT,
    voucher_id INT,
    employee_id INT,
    FOREIGN KEY (address_id) REFERENCES address(id),
    FOREIGN KEY (customer_id) REFERENCES customer(id),
    FOREIGN KEY (voucher_id) REFERENCES voucher(id),
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);
CREATE TABLE bill_detail (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    unit_price DECIMAL(19,4),
    quantity INT,
    color_id INT,
    size_id INT,
    order_id INT,
    product_id INT,
    FOREIGN KEY (order_id) REFERENCES bill(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);
CREATE TABLE bill_history (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    note NVARCHAR(255),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    order_id INT,
    FOREIGN KEY (order_id) REFERENCES bill(id)
);
CREATE TABLE cart (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
CREATE TABLE cart_detail (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    unit_price DECIMAL(19,4),
    quantity INT,
    color_id INT,
    size_id INT,
    cart_id INT,
    product_id INT,
    FOREIGN KEY (cart_id) REFERENCES cart(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);
CREATE TABLE coupon (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    code VARCHAR(30),
    name NVARCHAR(100),
    is_type INT,
    discount INT,
    cash DECIMAL(19,4),
    start_date DATETIME,
    end_date DATETIME,
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
CREATE TABLE rating (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    score INT,
    note NVARCHAR(255),
    create_date DATETIME,
    update_date DATETIME,
    create_by VARCHAR(30),
    update_by VARCHAR(30),
    status INT,
    product_id INT,
    customer_id INT,
    FOREIGN KEY (product_id) REFERENCES product(id),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);
CREATE TABLE rating_image (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    url VARCHAR(255),
    rating_id INT,
    FOREIGN KEY (rating_id) REFERENCES rating(id)
);
CREATE TABLE Background (
    Id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Type VARCHAR(30),
    Url VARCHAR(255),
    Content NVARCHAR(255),
    CreateDate DATETIME,
    UpdateDate DATETIME,
    CreateBy VARCHAR(30),
    UpdateBy VARCHAR(30),
    Status INT
);