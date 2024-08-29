DESCRIPTION = "Image for Mangopi-MQ board(T113) base Robot"

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image

WIFI_TOOLS = " \
    kernel-modules \
    rtl8189ftv \
    hostapd \
"

CONNECTIVITY_TOOLS += "\
    can-utils \
    libsocketcan \
    usbutils \
    libusbgx \
    lirc \
"

IO_TOOLS += "\
    libgpiod \
"

MISC_TOOLS += " \
    strace \
    vim \
    htop \
    lsof \
    e2fsprogs-resize2fs \
    os-release \
    lsb-release \
    v4l-utils \
"

IMAGE_INSTALL += " \
    ${WIFI_TOOLS} \
    ${CONNECTIVITY_TOOLS} \
    ${IO_TOOLS} \
    ${MISC_TOOLS} \
"

set_8189fs_loglevel(){
    mkdir -p ${IMAGE_ROOTFS}/etc/modprobe.d
    echo 'options 8189fs rtw_drv_log_level=1' > ${IMAGE_ROOTFS}/etc/modprobe.d/8189fs.conf
}

ROOTFS_POSTPROCESS_COMMAND += "set_8189fs_loglevel;"
