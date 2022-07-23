package org.dkazantsev.shopPractice.products.exceptions

import java.util.UUID

class ProductNotFoundException(publicId: UUID) : Exception("Product with publicId = $publicId not found")