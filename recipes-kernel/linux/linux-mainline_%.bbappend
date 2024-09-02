FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://001-add-ir-receiver-srf04-gpadc.patch \
    file://srf04.cfg \
    file://sun20i-gpadc.cfg \
    file://uvc.cfg \
    file://spi-nor.cfg \
"
